
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class X {

	protected List<Obejct> objectList;

	public X(List<Object> l) {
		objectList = l;
	}

	public void sumAccounts(List<Object> list) {
		List<Account> proxy = new ArrayList<>(list);
		Collections.sort(proxy);
		sync(0, proxy);
	}
	public void sync(int id, List<Object> list){
		if(id<list.size()){
			synchronized(list.get(id++)){
				sync(id, list);
			}
		}else{
			for(Object a : list) {
				//do something
			}
		}
	}
}
