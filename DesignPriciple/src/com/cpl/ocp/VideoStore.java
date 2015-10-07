package com.cpl.ocp;

import java.util.ArrayList;
import java.util.List;

public class VideoStore {
	public static void main(String[] args) {
		List<IVideo> videos = new ArrayList<IVideo>();
		videos.add(new OffAnimationVideo("first", "first_author", 3000));
		videos.add(new OffAnimationVideo("second", "second_author", 3300));
		videos.add(new OffAnimationVideo("third", "third_author", 4300));
		videos.add(new OffAnimationVideo("fourth", "fourth_author", 5000));
		videos.add(new OffAnimationVideo("fifth", "fifth_author", 1000));
		for(IVideo v:videos){
			System.out.println(v.getName()+"_"+v.getPrice());
		}
	}
}
