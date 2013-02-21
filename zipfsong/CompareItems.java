import java.util.Comparator;


public class CompareItems implements Comparator<Pair<Double, String>> {

	public int compare(Pair<Double,String> o1, Pair<Double, String> o2){
		int compared;
		if (o1.getKey() > o2.getKey()){
			compared = -1;
		}
		else if (o1.getKey() < o2.getKey()){
			compared = 1;
		}
		else{
			compared = 0;
		}
		
		return compared;
	}

}
