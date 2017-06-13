package org.dimigo.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MelonGenreChart {

	public static void main(String[] args) {
		Map<String,List<Music>> map = new HashMap<>();
		
		System.out.println("-- << 멜론 장르별 챠트 >> --");
		List<Music> list = new ArrayList<Music>();
		map.put("발라드",list);
		list.add(new Music("팔레트","아이유"));
		list = new ArrayList<>();
		map.put("댄스", list);
		list.add(new Music("I LUV IT","PSY"));
		list.add(new Music("맞지","언니쓰"));
		printMap(map);
		
		System.out.println();
		System.out.println("-- << 댄스 2위 곡 변경 >> --");
		map.get("댄스").set(1, new Music("SIGNAL","트와이스"));
		printMap(map);
		
		System.out.println();
		System.out.println("-- << 댄스 1위 곡 삭제 >> --");
		map.get("댄스").remove(0);
		printMap(map);
		
		System.out.println();
		System.out.println("-- << 전체 리스트 삭제 >> --");
		map.clear();
		printMap(map);
		
		

	}
	public static void printMap(Map<String, List<Music> > map){
		for(String key : map.keySet()){
			int i=1;
			System.out.println("[" + key + "]");
			for(Music m : map.get(key)){
				System.out.println(i +". " + m);
				i++;
			}
		}
	}

}
