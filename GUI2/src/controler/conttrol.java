package controler;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.CounterModel;
import view.CounterView;

public class conttrol implements ActionListener{
	
	private CounterView ctv; 
	
	public conttrol(CounterView ctv) {
		this.ctv = ctv;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		CounterModel ctm = new CounterModel();
		
		String src = e.getActionCommand();
		System.out.println(src+ " had been nhấn-ed" +"");
		
		if(src.equals("UP")) {
			this.ctv.increment();
		}else if (src.equals("DOWN")) {
			this.ctv.decrement();
		}
				
	
		
	}

}
