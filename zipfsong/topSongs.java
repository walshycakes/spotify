import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class topSongs {



	public static void main(String[] args) {

		try{
			int n=0;
			int m=0;

			int firstSongPlays = 0;

			ArrayList<Pair<Double, String>> data = new ArrayList<Pair<Double, String>>();
			//System.out.println("Enter a value for n and m");
			Scanner scnr = new Scanner(System.in);
			if(scnr.hasNextInt()){
			n = scnr.nextInt();
			}
			if(scnr.hasNextInt()){
			m = scnr.nextInt();
			}

			for(int i = 0; i < n; ++i){
				int plays = 0;
				if(scnr.hasNextInt()){
				plays = scnr.nextInt();
				}

				if(i == 0) {
					firstSongPlays = plays;
				}
				Pair<Double, String> entry = new Pair<Double, String>();
				double quality = ((double)plays/(double)((double)firstSongPlays/(i+1)));
				String title = "";
				if (scnr.hasNext()){
				title = scnr.next();
				}
				entry.setPair(quality, title);
				//System.out.println("Adding entry: " + title);
				data.add(entry);

			}
			Collections.sort(data, new CompareItems());
			//		for(int i = 0; i < data.size(); ++i){
			//			System.out.println(data.get(i).getKey() + " " + data.get(i).getValue());
			//		}
			for(int i = 0; i < m; ++i){
				System.out.println(data.get(i).getValue());
			}

		}

		catch(Exception e){
			System.out.println("Exception caught");
		      System.out.println(e.getStackTrace());
		}
		
		
	}
	
}
