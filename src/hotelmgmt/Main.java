package hotelmgmt;

import javax.swing.*;
abstract class Rooms
{
	protected int RoomCode;
	protected int RoomRent;
	protected int NumberOfDoubleBeds;
	protected int NumberOfSingleBed;
	abstract public void Display();
	abstract public void GetDetails();
}
class LuxuryRoom extends Rooms
{
	protected boolean Spa;
	protected boolean Balcony;
	protected int NumberOfRooms;
	protected int NumberOfRestrooms;
	protected int AdditionalBedsRequested;
	
	@Override
	public void Display()
	{
		//TODO give GUI implementation 
	}
	public void GetDetails()
	{
		//TODO receive info using GUI and use exceptions
	}
}
class DeluxeRoom extends Rooms
{
	protected boolean ComplimentaryMeals;
	protected boolean ComplimentaryParking;
	@Override
	public void Display()
	{
		//TODO give GUI implementation
		
	}
	@Override 
	public void GetDetails()
	{
		//TODO receive info using GUI
	}
}

public class Main
{
	public static void main(String [] args)
	{
	
	}
}