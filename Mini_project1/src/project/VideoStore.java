package project;
import java.util.*;
public class VideoStore {
		Map<String,Video> lv=new HashMap<String,Video>();
		void addVideo(String name)
		{
			Video v= new Video(name);
			lv.put(name,v);
			System.out.println("Video \""+v.videoName+"\" added successfully.");
		}
		void doCheckout(String name)
		{
			if(lv.containsKey(name))
			{
				lv.get(name).doCheckout();
				System.out.println("Video \""+name+"\" checked out successfully.");
			}
			else
				System.out.println("No such Video exists");
		}
		void doReturn(String name)
		{
			if(lv.containsKey(name))
			{
				lv.get(name).doReturn();
				System.out.println("Video \""+name+"\" returned successfully.");
			}
			else
				System.out.println("No such Video exists");
		}
		void receiveRating(String name,int rating)
		{
			if(lv.containsKey(name))
			{
				lv.get(name).receiveRating(rating);
				System.out.println("Rating \""+rating+"\" has been moved to the Video "+"\""+name+"\".");
			}
			else
			{
				System.out.println("No such Video exists");
			}
		}
		void listinventory()
		{
			System.out.println("---------------------------------------------------------------------------------");
			System.out.println("Video Name\t|\tCheckout Status |\tRating");
			for (String v : lv.keySet())
			{
				System.out.println((lv.get(v)).getName()+"\t\t|\t"+lv.get(v).getCheckout()+"\t\t|\t"+lv.get(v).getRating());
			}
			System.out.println("---------------------------------------------------------------------------------");
		}

}
