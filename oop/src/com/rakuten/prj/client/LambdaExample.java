package com.rakuten.prj.client;

import java.util.function.Function;
import java.util.function.BiFunction;

public class LambdaExample {

	public static void main(String[] args) {
		Function<Integer, Double> f1 = new Function<Integer, Double>() {

			@Override
			public Double apply(Integer t) {
				// TODO Auto-generated method stub
				return t / 2.0;
			}
		};
		System.out.println(f1.apply(5));

		Function<Integer, Double> f2 = (Integer t) -> {
			return t / 2.0;
		};
		System.out.println(f2.apply(20));

		Function<Integer, Double> f3 = t -> t / 2.0;
		System.out.println(f3.apply(24));

		BiFunction<Integer, Integer, Integer> f4 = (t, u) -> t + u;
		System.out.println(f4.apply(4, 5));

		BiFunction<Integer, Integer, Integer> f5 = (t, u) -> t * u;
		System.out.println(f5.apply(4, 5));

	}

}
