package designpatterns.creational;

public class TestSingleton {

	public static void main(String[] args) {
		//1. Eager Singleton
		EagerSingleton.getInstance();
		EagerSingleton.getInstance();
		
		//2. Eager Singleton with exception
		EagerSingletonWithException.getInstance();
		EagerSingletonWithException.getInstance();
		
		//3.Lazy Singleton
		LazySingleton.getInstance();
		LazySingleton.getInstance();
		
		//4.Lazy Thread-safe Singleton
		LazyThreadsafeSingleton.getInstance();
		LazyThreadsafeSingleton.getInstance();
		
		//5.Lazy Thread-safe optimized Singleton
		LazyThreadsafeOptimizedSingleton.getInstance();
		LazyThreadsafeOptimizedSingleton.getInstance();
		
		//6.Bill Pugh implementation
		BillPughImplSingleton.TestStaticInitialization();
		System.out.println("Called static test method now moving on...");
		BillPughImplSingleton.getInstance();
		BillPughImplSingleton.getInstance();
	}

}


class EagerSingleton {
	private static EagerSingleton eagerSingletoninstance = new EagerSingleton();
	
	private EagerSingleton() {System.out.println("Calling constructor:"+this.getClass());}
	
	public static EagerSingleton getInstance() {
		return eagerSingletoninstance; 
	}
}

class EagerSingletonWithException {
	private static EagerSingletonWithException eagerSingletonWithException;
	
	static {
		try {
			eagerSingletonWithException = new EagerSingletonWithException();
		}
		catch(Exception e) {
			System.out.println("Catching exception..."+e.getMessage());
		}
	}
	
	private EagerSingletonWithException() throws Exception {
		System.out.println("Calling constructor:"+this.getClass());
		throw new Exception("My Test Exception");
	}
	
	public static EagerSingletonWithException getInstance() {
		return eagerSingletonWithException; 
	}
}

class LazySingleton{
	private static LazySingleton lazySingleton;
	private LazySingleton() {System.out.println("Calling constructor:"+this.getClass());}
	
	public static LazySingleton getInstance() {
		if(lazySingleton == null) {
			lazySingleton = new LazySingleton();
		}
		return lazySingleton;
	}
}

class LazyThreadsafeSingleton{
	private static LazyThreadsafeSingleton lazyThreadsafeSingleton;
	private LazyThreadsafeSingleton() {System.out.println("Calling constructor:"+this.getClass());}
	
	public static synchronized LazyThreadsafeSingleton getInstance() {
		if(lazyThreadsafeSingleton == null) {
			lazyThreadsafeSingleton = new LazyThreadsafeSingleton();
		}
		return lazyThreadsafeSingleton;
	}
}

class LazyThreadsafeOptimizedSingleton{
	private static LazyThreadsafeOptimizedSingleton lazyThreadsafeOptimizedSingleton;
	private LazyThreadsafeOptimizedSingleton() {System.out.println("Calling constructor:"+this.getClass());}
	
	public static LazyThreadsafeOptimizedSingleton getInstance() {
		if(lazyThreadsafeOptimizedSingleton == null) {
			synchronized (LazyThreadsafeOptimizedSingleton.class) {
				if(lazyThreadsafeOptimizedSingleton == null) {
					lazyThreadsafeOptimizedSingleton = new LazyThreadsafeOptimizedSingleton();
				}
			}
		}
		return lazyThreadsafeOptimizedSingleton;
	}
}

class BillPughImplSingleton{
	private static class InnerSingletonHolder{
		private static final BillPughImplSingleton INSTANCE = new BillPughImplSingleton();	
	}
	private BillPughImplSingleton() {System.out.println("Calling constructor"+this.getClass());};
	
	public static void TestStaticInitialization() {System.out.println("Calling Sample Static Test Method.");};
	
	public static BillPughImplSingleton getInstance() {
		return InnerSingletonHolder.INSTANCE;
	}
}