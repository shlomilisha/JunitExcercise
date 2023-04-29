import java.util.ArrayList;

public class Google {
	ArrayList<Integer> list = new ArrayList<Integer>();
	
	public Google(ArrayList<Integer> list) {
		this.list = list;
		
	}

	public void add(int number) {
		list.add(number);	
	}

	public Integer get(int index) {
		return list.get(index);
	}

}
