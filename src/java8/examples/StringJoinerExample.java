package java8.examples;

import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collectors;

public class StringJoinerExample {

	public static void main(String[] args) {

		/* 1. StringJoiner */

		// 1.1 Join String by a delimiter
		StringJoiner sj1 = new StringJoiner(",");
		sj1.add("aaa");
		sj1.add("bbb");
		sj1.add("ccc");
		// OR
		sj1.add("ppp").add("qqq").add("rrr");
		System.out.println("Example 1.1: " + sj1/* .toString() */);

		// 1.2 Join String by a delimiter and starting with a supplied prefix and ending
		// with a supplied suffix.
		StringJoiner sj2 = new StringJoiner("/", "prefix-", "-suffix");
		sj2.add("2016");
		sj2.add("02");
		sj2.add("26");
		System.out.println("Example 1.2: " + sj2); // prefix-2016/02/26-suffix

		/* 2. String.join - StringJoiner is used internally by static String.join(). */

		// 2.1 Join String by a delimiter.
		String result = String.join("-", "2015", "10", "31"); // 2015-10-31
		System.out.println("Example 2.1: " + result);

		// 2.2 Join a List by a delimiter.
		List<String> list = Arrays.asList("java", "python", "nodejs", "ruby");
		result = String.join(", ", list);
		System.out.println("Example 2.2: " + result); // java, python, nodejs, ruby\

		/* 3. Collectors.joining */
		// Two Stream and Collectors.joining examples.

		// 3.1 Join List<String> example.
		List<String> list2 = Arrays.asList("java", "python", "nodejs", "ruby");
		result = list2.stream().map(x -> x).collect(Collectors.joining(" | ")); // java | python | nodejs | ruby
		System.out.println("Example 3.1: " + result);
		
		// 3.2 Join List<Object> example.
		List<Game> list3 = Arrays.asList(
				new Game("Dragon Blaze", 5), 
				new Game("Angry Bird", 5),
				new Game("Candy Crush", 5));

		result = list3.stream().map(x -> x.getName()).collect(Collectors.joining(", ", "{", "}"));
		System.out.println("Example 3.2: " + result); // {Dragon Blaze, Angry Bird, Candy Crush}

	}

	static class Game {
		String name;
		int ranking;

		public Game(String name, int ranking) {
			this.name = name;
			this.ranking = ranking;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getRanking() {
			return ranking;
		}

		public void setRanking(int ranking) {
			this.ranking = ranking;
		}
	}

}
