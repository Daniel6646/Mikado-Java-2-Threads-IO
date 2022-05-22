package assignment.basic;
enum TrainingQuality {GOOD(8),SUPERB(9),EXCELLENT(10);
int rating;
TrainingQuality (int rating)
	{
	this.rating=rating;
    }
public int getRating()
	{
	return rating;
    }
}
public class Training
{
	public static void main(String args[])
	{
		TrainingQuality quality=TrainingQuality.GOOD;
		System.out.println("Quality="+ quality + "rating="+ quality.getRating());
		for(TrainingQuality tq:TrainingQuality.values())
			System.out.println("Quality="+ tq + "rating="+ tq.getRating());
	}
}