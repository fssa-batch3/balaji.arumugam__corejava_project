package day08.practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
public class EmployeesList {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cnt = 0;
		int num = 4;
		HashMap<String, ArrayList<String>> cntMap = new HashMap<String, ArrayList<String>>();
		while (cnt < num) {
			String s = sc.nextLine();
			String[] ar = s.split(",");
			int result = 0;
			for (String deptName : cntMap.keySet()) {
				if (ar[0].equals(deptName)) {
					result = 1;
				}
			}
			if (result == 1) {
				ArrayList<String> arr = cntMap.get(ar[0]);
				arr.add(ar[1]);
				cntMap.put(ar[0], arr);
			}
			else {
				ArrayList<String> arr = new ArrayList<String>();
				arr.add(ar[1]);
				cntMap.put(ar[0], arr);
			}
			cnt++;
		}
		System.out.println(cntMap.keySet());
		for (String n : cntMap.keySet()) {
			System.out.println(n + " : " + cntMap.get(n));
		}
	}
}