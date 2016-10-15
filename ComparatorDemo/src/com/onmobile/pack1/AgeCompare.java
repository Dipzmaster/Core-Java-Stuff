package com.onmobile.pack1;

import java.util.Comparator;

public class AgeCompare implements Comparator<Person> {


	@Override
	public int compare(Person o1, Person o2) {
		int	res =o1.getAge()-o2.getAge();
		if(res==0)
			return 0;
			else
				if (res>0){
					return 1;
				}
				else 
					return -1;
	}
	
	

}
