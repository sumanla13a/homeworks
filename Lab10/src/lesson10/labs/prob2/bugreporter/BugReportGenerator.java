package lesson10.labs.prob2.bugreporter;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.annotation.Annotation;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import java.util.logging.Logger;

import lesson10.labs.prob2.classfinder.ClassFinder;

/**
 * This class scans the package lesson10.labs.prob2.javapackage
 * for classes with annotation @BugReport. It then generates a bug report
 * bugreport.txt, formatted like this:
 * 
 * Joe Smith
 *     reportedBy:
 *     classname:
 *     description:
 *     severity:
 *     
 *     reportedBy:
 *     classname:
 *     description:
 *     severity:
 *     
 * Tom Jones
 *     reportedBy:
 *     classname:
 *     description:
 *     severity:
 *     
 *     reportedBy:
 *     classname:
 *     description:
 *     severity:
 * 
 *
 */
public class BugReportGenerator {
	private static final Logger LOG = Logger.getLogger(BugReportGenerator.class.getName());
	private static final String PACKAGE_TO_SCAN = "lesson10.labs.prob2.javapackage";
	private static final String REPORT_NAME = "bug_report.txt";
	private static final String REPORTED_BY = "reportedBy: ";
	private static final String CLASS_NAME = "classname: ";
	private static final String DESCRIPTION = "description: ";
	private static final String SEVERITY = "severity: ";
	public void reportGenerator() throws IOException {
		HashMap<String, List<List<String>>> logHash = new HashMap<String, List<List<String>>>();
		List<Class<?>> classes = ClassFinder.find(PACKAGE_TO_SCAN);
		classes.forEach(e -> {
			if(e.isAnnotationPresent(BugReport.class)) {
				BugReport annotation = (BugReport) e.getAnnotation(BugReport.class);
				List<String> details = Arrays.asList(new String[]{
						"	Reported by:	" + annotation.reportedBy(),
						"	Class:		" + e.getName(),
						"	Description:	" + annotation.description(),
						"	Severity:	" + annotation.severity()
				});
				if(logHash.containsKey(annotation.assignedTo())) {
					List<List<String>> data = (List<List<String>>)logHash.get(annotation.assignedTo());
					data.add(details);
					logHash.put(annotation.assignedTo(), data);
				} else {
					List<List<String>> finalDetail = new ArrayList<List<String>>();
					finalDetail.add(details);
					logHash.put(annotation.assignedTo(), finalDetail);
				}

			}
		});
		FileWriter fw;
		fw = new FileWriter(REPORT_NAME);
		logHash.forEach((e,f)-> {
			try {
				fw.write(e);
				fw.write("\n");
			} catch (IOException e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			}
			f.forEach(r -> {
					r.forEach(s -> {
							try {
								fw.write(s);
								fw.write("\n");
							} catch (IOException e1) {
								System.out.println("fucl");
								e1.printStackTrace();
							}
					});
					try {
						fw.write("\n");
					} catch (IOException e2) {
						// TODO Auto-generated catch block
						e2.printStackTrace();
					}
				});
			});
		fw.close();
		

		
	}
	
	
}
