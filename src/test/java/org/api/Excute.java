package org.api;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Excute {

	public static void main(String[] args) {
		HDFCPOJO h = new HDFCPOJO();
		h.setUsername("ravi");
		h.setPassword(123);


		String x = h.getUsername();   // Ravi account validated
		int accbalance = h.getPassword();
		System.out.println(accbalance);



		HDFCPOJO h1 =new  HDFCPOJO();
		h1.setUsername("Bharathi");
		h1.setPassword(321);

		HDFCPOJO h2 =new  HDFCPOJO();
		h1.setUsername("muthu");
		h1.setPassword(321);


		// Generics - pre defined Wrapper class
		// Generics - uder defind Wrapper class

		List<HDFCPOJO> li = new ArrayList();

		li.add(h);
		li.add(h2);
		li.add(h1);
		// user defind list
		for (int i = 0; i < li.size(); i++) {
			HDFCPOJO hdfcpojo = li.get(i);
			// i=0, hdfcpojo=h
			// i=1, hdfcpojo= h1
			System.out.println(hdfcpojo.getUsername());
			System.out.println(hdfcpojo.getPassword());
		}





		// user defind set

		Set<HDFCPOJO> si = new LinkedHashSet();
		si.add(h);
		si.add(h2);
		si.add(h1);

		for (HDFCPOJO s : si) {
			System.out.println(s.getUsername());
			System.out.println(s.getPassword());
		}




		// uder defind map


		Map<Integer,HDFCPOJO> m = new LinkedHashMap();

		m.put(10,h);
		m.put(20,h1);
		m.put(30, h2);

		Collection<HDFCPOJO> value = m.values();
		for (HDFCPOJO v : value) {
			System.out.println(v.getUsername());
			System.out.println(v.getPassword());
		}


		Set<Entry<Integer, HDFCPOJO>> entrySet = m.entrySet();

		for (Entry<Integer, HDFCPOJO> e : entrySet) {
			System.out.println(e.getValue().getPassword());
			System.out.println(e.getValue().getUsername());
		}





	}












}
