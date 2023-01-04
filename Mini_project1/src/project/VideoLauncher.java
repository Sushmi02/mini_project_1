package project;
import java.util.*;
public class VideoLauncher {
	public static void main(String[] args) {
		VideoStore vs=new VideoStore();
		Scanner sc=new Scanner(System.in);
		int op=0;
		do {
		System.out.println("MAIN MENU\n========");
		System.out.println("1.Add Videos: \n2.Check  Out Video : \n3.Return Video : \n4.Receive Rating : \n5.List Inventory : \n6.Exit : \nEnter your choice (1..6): ");
		op=sc.nextInt();
		switch(op)
		{
		case 1: System.out.println("Enter the name of the video you want to add: ");
		sc.nextLine();
		        String name=sc.nextLine();
		        vs.addVideo(name);
		        break;
		case 2: System.out.println("Enter the name of the video you want to check out: ");
		sc.nextLine();
	            String name1=sc.nextLine();
	            vs.doCheckout(name1);
	            break;
		case 3: System.out.println("Enter the name of the video you want to Return: ");
		sc.nextLine();
		        String name2=sc.nextLine();
		        vs.doReturn(name2);
		        break;
		case 4: System.out.println("Enter the name of the video you want to Rate: ");
		sc.nextLine();
		        String name3=sc.nextLine();
		        System.out.println("Enter the rating for this video: ");
		        int rating=sc.nextInt();
		        vs.receiveRating(name3,rating);
		        break;
		case 5: vs.listinventory();
		break;
		}
		}while(op<6);
		System.out.println("Exiting...!! Thanks for using the application.");
	}
}
