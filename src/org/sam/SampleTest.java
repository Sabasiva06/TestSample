package org.sam;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class SampleTest {

	public static void main(String[] args) {
		Map<String, String> map = new LinkedHashMap<>();
		map.put("A", "a");
		map.put("B", "b");
		map.put("C", "c");
		map.put("D", "d");
		map.put("E", "e");

		List<String> li = new ArrayList<String>();
		li.add("Java");
		li.add("Selenium");
		li.add("python");
		li.add("Api Testing");
		li.add("Appium");

		Set<String> s = new LinkedHashSet<>();
		s.add("add");
		s.add("sub");
		s.add("multiply");
		s.add("division");

		Set<String> s1 = new TreeSet<>();
		s.add("1");
		s.add("2");
		s.add("3");
		s.add("4");
		s.add("5");

	}
}
