package test;
import model.CounterModel;
import view.CounterView;

public class test {
	public static void main(String[] args) {
		CounterModel ct = new CounterModel();
		ct.increment();
		System.out.println(ct.getValue());
		ct.decrement();
		System.out.println(ct.getValue());
		
		CounterView ctv = new CounterView();
	}
}
