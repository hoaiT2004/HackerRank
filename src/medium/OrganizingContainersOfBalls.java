package medium;

import java.net.Socket;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class OrganizingContainersOfBalls {
	public static String organizingContainers(List<List<Integer>> container) {
		int sizeBall[] = new int[container.size()];
		int sizeContainer[] = new int[container.size()];
		int x = 0;
		for (List<Integer> list : container) {
			int i = 0;
			for (Integer list2 : list) {
				sizeContainer[x] += list2;
			}
			x++;
			while (i != sizeBall.length) {
				sizeBall[i] += list.get(i);
				i++;
			}
		}
		Arrays.sort(sizeContainer);
		Arrays.sort(sizeBall);
		for (int j = 0; j < sizeBall.length; j++) {
			if (sizeBall[j] != sizeContainer[j])
				return "Impossible";
		}
		return "Possible";
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int q = sc.nextInt();
		while (q != 0) {
			List<List<Integer>> container = new ArrayList<List<Integer>>();
			int n = sc.nextInt();
			for (int i = 0; i < n; i++) {
				List<Integer> list = new ArrayList<Integer>();
				for (int j = 0; j < n; j++) {
					list.add(sc.nextInt());
				}
				container.add(list);
			}
			String res = organizingContainers(container);
			System.out.println(res);
			q--;
		}
	}
}
