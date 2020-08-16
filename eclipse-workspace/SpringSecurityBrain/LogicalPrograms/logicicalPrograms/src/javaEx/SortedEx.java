package javaEx;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortedEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<EmployeeEx> emps = new ArrayList<>();
		emps.add(new EmployeeEx(10, "krishna", 29, 150000));
		emps.add(new EmployeeEx(20, "kanth", 29, 320000));
		emps.add(new EmployeeEx(30, "gopi", 31, 18000));
		emps.add(new EmployeeEx(40, "hari priyanka", 19, 150000));
		emps.add(new EmployeeEx(50, "bala", 30, 50000));

		Collections.sort(emps, (o1, o2) -> o1.getName().compareTo(o2.getName()));
		System.out.println(emps);

		// emps.stream().sorted(Comparator.comparing(EmployeeEx::getSalary).reversed()).collect(Collectors.toList())
		// .forEach(System.out::println);
	}

}
