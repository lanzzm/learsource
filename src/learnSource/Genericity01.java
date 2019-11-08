/**
$
file_name :Genericity01.java
git_config:
package_name:learnSource
project_name:learnSource
time:下午4:42:05
todo:TODO
type_name:Genericity01
user:lzm
year:2019



 */
package learnSource;

import java.util.ArrayList;
import java.util.List;

import learnSource.other.Animal;
import learnSource.other.Dog;

/**
 * @author lanzm
 *
 */
public class Genericity01 {
	
	
	static int countLegs (List<? extends Animal > animals ) {
	    int retVal = 0;
	    for ( Animal animal : animals )
	    {
	        retVal += animal.countLegs();
	    }
	    return retVal;
	}

	static int countLegs1 (List< Animal > animals ){
	    int retVal = 0;
	    for ( Animal animal : animals )
	    {
	        retVal += animal.countLegs();
	    }
	    return retVal;
	}

	public static void main(String[] args) {
	    List<Dog> dogs = new ArrayList<>();
	 	// 不会报错
	    countLegs( dogs );
		// 报错
	    countLegs1(dogs);
	    
	}


	
	
	
	
	
	

}
