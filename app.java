/* app.java @BitcoinJake09 5/29/2018
*/

import java.io.*;
import java.util.*;

public class app
{
	public static void main(String[] args) throws IOException, InterruptedException{

	int sleeper=(int)(0 * 1000);//if 0 will compute instant. otherwise set sleeper time in milsec
	    // // read KeyWestTemp.txt

        System.out.println("scanning from words.txt");
	Thread.sleep(sleeper);

	int wordscount = 0;
        Scanner sc1 = null;
	List<String> wordslist = new ArrayList<String>();
    try {
        sc1 = new Scanner(new File("words.txt"));
    } catch (FileNotFoundException e) {
        e.printStackTrace();  
    }
    while (sc1.hasNextLine()) {
            Scanner s1 = new Scanner(sc1.nextLine());
        while (s1.hasNext()) {
	    wordscount++;
            String str1 = s1.next();
	    wordslist.add(str1);
        }
    }

        System.out.println("printing from wordslist array");
	Thread.sleep(sleeper);

	
        wordscount=0;	
		
	for(int i=0;i<wordslist.size();i++){
        wordscount++;
        Thread.sleep(sleeper/500);
    	System.out.println(wordscount+") "+wordslist.get(i));
	}
// end of words.txt

        System.out.println("scanning from BIPwords.txt");
	Thread.sleep(sleeper);

	int BIPwordscount = 0;
        Scanner sc2 = null;
	List<String> BIPwordslist = new ArrayList<String>();
    try {
        sc2 = new Scanner(new File("BIPwords.txt"));
    } catch (FileNotFoundException e) {
        e.printStackTrace();  
    }
    while (sc2.hasNextLine()) {
            Scanner s2 = new Scanner(sc2.nextLine());
        while (s2.hasNext()) {
	    BIPwordscount++;
            String str2 = s2.next();
	    BIPwordslist.add(str2);
        }
    }	
        System.out.println("printing from BIPwordslist array");
	Thread.sleep(sleeper);
        BIPwordscount=0;	
		
	for(int j=0;j<BIPwordslist.size();j++){
        BIPwordscount++;
        Thread.sleep(sleeper/500);
    	System.out.println(BIPwordscount+") "+BIPwordslist.get(j));
	}
	//end of BIPwordlist

	//start comparing words
	File CompleteWordList = new File("dictionary.txt");
	if (CompleteWordList.exists()){ CompleteWordList.delete(); }

	PrintWriter writer = new PrintWriter("dictionary.txt", "UTF-8");
	List<String> finishedlist = new ArrayList<String>();
	for(int x=0;x<wordslist.size();x++){
	 for(int y=0;y<BIPwordslist.size();y++){
	  if (BIPwordslist.get(y).equals(wordslist.get(x))) {	        
    	   System.out.println("in BIP list: "+wordslist.get(x));
           finishedlist.add(wordslist.get(x));
           writer.println(wordslist.get(x));
	   }
	  }	
	}
	writer.close();

	//print compared words leftover
	int fcount=0;
	for(int z=0;z<finishedlist.size();z++){
         fcount++;
         Thread.sleep(sleeper/500);
    	 System.out.println(fcount+") "+finishedlist.get(z));
	}
	
	System.out.println("trying with 12 loop");
	Thread.sleep(sleeper);	
	

	String tempString="";
	List<String> final12wordlist = new ArrayList<String>();
		//print 12 words??
	File f12 = new File("final12wordlist.txt");
	if (f12.exists()){ f12.delete(); }

	writer = new PrintWriter("final12wordlist.txt", "UTF-8");

	for(int x=0;x<=finishedlist.size()-12;x++){
	 for(int y=0;y<=finishedlist.size()-11;y++){
	  for(int looper1=0;looper1<=finishedlist.size()-10;looper1++){
           for(int looper2=0;looper2<=finishedlist.size()-9;looper2++){
            for(int looper3=0;looper3<=finishedlist.size()-8;looper3++){
             for(int looper4=0;looper4<=finishedlist.size()-7;looper4++){
              for(int looper5=0;looper5<=finishedlist.size()-6;looper5++){
	       for(int looper6=0;looper6<=finishedlist.size()-5;looper6++){
		for(int looper7=0;looper7<=finishedlist.size()-4;looper7++){
		 for(int looper8=0;looper8<=finishedlist.size()-3;looper8++){
         	  for(int looper9=0;looper9<=finishedlist.size()-2;looper9++){
                   for(int looper10=0;looper10<finishedlist.size();looper10++){
		
			if (finishedlist.get(x).equals(finishedlist.get(y))){y++;}
			if (finishedlist.get(y).equals(finishedlist.get(looper1))){looper1++;}
			if (finishedlist.get(looper1).equals(finishedlist.get(looper2))){looper2++;}
			if(finishedlist.get(looper2).equals(finishedlist.get(looper3))){looper3++;}
			if(finishedlist.get(looper3).equals(finishedlist.get(looper4))){looper4++;}
			if(finishedlist.get(looper4).equals(finishedlist.get(looper5))){looper5++;}
			if(finishedlist.get(looper5).equals(finishedlist.get(looper6))){looper6++;}
			if(finishedlist.get(looper6).equals(finishedlist.get(looper7))){looper7++;}
			if(finishedlist.get(looper7).equals(finishedlist.get(looper8))){looper8++;}
			if(finishedlist.get(looper8).equals(finishedlist.get(looper9))){looper9++;}
			if(finishedlist.get(looper9).equals(finishedlist.get(looper10))){looper10++;}

			if(finishedlist.get(x).equals(finishedlist.get(looper1))){looper1++;}
			if(finishedlist.get(x).equals(finishedlist.get(looper2))){looper2++;}
			if(finishedlist.get(x).equals(finishedlist.get(looper3))){looper3++;}
			if(finishedlist.get(x).equals(finishedlist.get(looper4))){looper4++;}
			if(finishedlist.get(x).equals(finishedlist.get(looper5))){looper5++;}
			if(finishedlist.get(x).equals(finishedlist.get(looper6))){looper6++;}
			if(finishedlist.get(x).equals(finishedlist.get(looper7))){looper7++;}
			if(finishedlist.get(x).equals(finishedlist.get(looper8))){looper8++;}
			if(finishedlist.get(x).equals(finishedlist.get(looper9))){looper9++;}
			if(finishedlist.get(x).equals(finishedlist.get(looper10))){looper10++;}
			
			if(finishedlist.get(y).equals(finishedlist.get(looper2))){looper2++;}
			if(finishedlist.get(y).equals(finishedlist.get(looper3))){looper3++;}
			if(finishedlist.get(y).equals(finishedlist.get(looper4))){looper4++;}
			if(finishedlist.get(y).equals(finishedlist.get(looper5))){looper5++;}
			if(finishedlist.get(y).equals(finishedlist.get(looper6))){looper6++;}
			if(finishedlist.get(y).equals(finishedlist.get(looper7))){looper7++;}
			if(finishedlist.get(y).equals(finishedlist.get(looper8))){looper8++;}
			if(finishedlist.get(y).equals(finishedlist.get(looper9))){looper9++;}
			if(finishedlist.get(y).equals(finishedlist.get(looper10))){looper10++;}

			if(finishedlist.get(looper1).equals(finishedlist.get(looper3))){looper3++;}
			if(finishedlist.get(looper1).equals(finishedlist.get(looper4))){looper4++;}
			if(finishedlist.get(looper1).equals(finishedlist.get(looper5))){looper5++;}
			if(finishedlist.get(looper1).equals(finishedlist.get(looper6))){looper6++;}
			if(finishedlist.get(looper1).equals(finishedlist.get(looper7))){looper7++;}
			if(finishedlist.get(looper1).equals(finishedlist.get(looper8))){looper8++;}
			if(finishedlist.get(looper1).equals(finishedlist.get(looper9))){looper9++;}
			if(finishedlist.get(looper1).equals(finishedlist.get(looper10))){looper10++;}

			if(finishedlist.get(looper2).equals(finishedlist.get(looper4))){looper4++;}
			if(finishedlist.get(looper2).equals(finishedlist.get(looper5))){looper5++;}
			if(finishedlist.get(looper2).equals(finishedlist.get(looper6))){looper6++;}
			if(finishedlist.get(looper2).equals(finishedlist.get(looper7))){looper7++;}
			if(finishedlist.get(looper2).equals(finishedlist.get(looper8))){looper8++;}
			if(finishedlist.get(looper2).equals(finishedlist.get(looper9))){looper9++;}
			if(finishedlist.get(looper2).equals(finishedlist.get(looper10))){looper10++;}

			if(finishedlist.get(looper3).equals(finishedlist.get(looper5))){looper5++;}
			if(finishedlist.get(looper3).equals(finishedlist.get(looper6))){looper6++;}
			if(finishedlist.get(looper3).equals(finishedlist.get(looper7))){looper7++;}
			if(finishedlist.get(looper3).equals(finishedlist.get(looper8))){looper8++;}
			if(finishedlist.get(looper3).equals(finishedlist.get(looper9))){looper9++;}
			if(finishedlist.get(looper3).equals(finishedlist.get(looper10))){looper10++;}

			if(finishedlist.get(looper4).equals(finishedlist.get(looper6))){looper6++;}
			if(finishedlist.get(looper4).equals(finishedlist.get(looper7))){looper7++;}
			if(finishedlist.get(looper4).equals(finishedlist.get(looper8))){looper8++;}
			if(finishedlist.get(looper4).equals(finishedlist.get(looper9))){looper9++;}
			if(finishedlist.get(looper4).equals(finishedlist.get(looper10))){looper10++;}

			if(finishedlist.get(looper5).equals(finishedlist.get(looper7))){looper7++;}
			if(finishedlist.get(looper5).equals(finishedlist.get(looper8))){looper8++;}
			if(finishedlist.get(looper5).equals(finishedlist.get(looper9))){looper9++;}
			if(finishedlist.get(looper5).equals(finishedlist.get(looper10))){looper10++;}

			if(finishedlist.get(looper6).equals(finishedlist.get(looper8))){looper8++;}
			if(finishedlist.get(looper6).equals(finishedlist.get(looper9))){looper9++;}
			if(finishedlist.get(looper6).equals(finishedlist.get(looper10))){looper10++;}

			if(finishedlist.get(looper7).equals(finishedlist.get(looper9))){looper9++;}
			if(finishedlist.get(looper7).equals(finishedlist.get(looper10))){looper10++;}

			if(finishedlist.get(looper8).equals(finishedlist.get(looper10))){looper10++;}


	Thread.sleep(sleeper/1);



// need to convert to private keys and check with a node as we go....
    	 
	


			tempString=finishedlist.get(x)+" "+finishedlist.get(y)+" "+finishedlist.get(looper1)+" "+finishedlist.get(looper2)+" "+finishedlist.get(looper3)+" "+finishedlist.get(looper4)+" "+finishedlist.get(looper5)+" "+finishedlist.get(looper6)+" "+finishedlist.get(looper7)+" "+finishedlist.get(looper8)+" "+finishedlist.get(looper9)+" "+finishedlist.get(looper10);
			   //final12wordlist.add(tempString);
			System.out.println(tempString);
			writer.println(tempString);
			//} //end if

	  }}}}}}}}}}}} //end all loopdedoops


	writer.close();
/*
	Thread.sleep(sleeper/1);
	//remove doubles??
	fcount=0;
	for(int x=0;x<wordlist12.size();x++){
	 for(int y=0;y<wordlist12.size();y++){
          Thread.sleep(sleeper/200);
	  if (wordlist12.get(x).equals(wordlist12.get(y))) {
           fcount++;
    	   System.out.println("Removed: "+fcount+") "+wordlist12.get(y));
	   wordlist12.remove(y);
	   }
	  }
	}
	Thread.sleep(sleeper/1);

	//print 12 words??
	File file = new File("12WordPhrases.txt");
	if (file.exists()){ file.delete(); }

	writer = new PrintWriter("12WordPhrases.txt", "UTF-8");
	fcount=0;
	for(int z=0;z<wordlist12.size();z++){
         fcount++;
         Thread.sleep(sleeper/50);
    	 System.out.println(fcount+") "+wordlist12.get(z));
	 writer.println(wordlist12.get(z));
	}
	writer.close();
	*/

	System.out.println("Done. @BitcoinJake09");
	}
}

