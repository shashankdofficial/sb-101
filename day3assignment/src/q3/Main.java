package q3;

public class Main {

		//this keyword used at the time of serilization when we don't want to save our
		//any variable for any security reason then that type of variable we decalre as 
		//transient
		String name;
		transient int pass;
		
		public Main(String name, int pass) {
			super();
			this.name = name;
			this.pass = pass;
		}
		
		@Override
		public String toString() {
			return "Transit [name=" + name + "]";
		}
		
		public static void main(String[] args) {
			Main tr = new Main("Shashank", 12345);
			System.out.println(tr.toString());
			
			//on printing you can't see the password
			//because of transient
		}
}
