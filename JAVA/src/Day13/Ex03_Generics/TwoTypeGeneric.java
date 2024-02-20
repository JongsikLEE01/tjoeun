package Day13.Ex03_Generics;

class KeyValue<K,V>{
	private K Key;
	private V Value;
	public K getKey() {
		return Key;
	}
	public void setKey(K key) {
		Key = key;
	}
	public V getValue() {
		return Value;
	}
	public void setValue(V value) {
		Value = value;
	}
}

public class TwoTypeGeneric {
	public static void main(String[] args) {
		// 제네릭 객체 생성
		// 클래스<타입1,2> 객체명 = new 클래스<타입1,2>();
		// 객체 생성하는 클래스명 뒤의 타입은 생략 가능
		// KeyValue<String, Integer> kv = new KeyValue<String, Integer>(); 
		KeyValue<String, Integer> kv = new KeyValue<>(); 
		
		kv.setKey("Java");
		kv.setValue(100);
		
		KeyValue<Integer, String> kv2 = new KeyValue<>();
		kv2.setKey(100);
		kv2.setValue("Java");
		
		System.out.println("kv - key : "+kv.getKey());
		System.out.println("kv - Value : "+kv.getValue());
		
		System.out.println("kv2 - key : "+kv2.getKey());
		System.out.println("kv2 - Value : "+kv2.getValue());
		
		// k타입은 지정하고 v타입은 지정하지 않으면?
		// void 해당 타입에는 변수를 사용하지 않도록 지정
		KeyValue<String, Void> kv3 = new KeyValue<>();
		kv3.setKey("키만");
		String key3 = kv3.getKey();
		System.out.println("key3 : "+key3);
	}
}
