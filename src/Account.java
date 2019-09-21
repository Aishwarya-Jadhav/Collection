
public class Account {

		private int accno;
		private String name;
		private int accbal;
		public Account(int accno, String name, int accbal) {
			super();
			this.accno = accno;
			this.name = name;
			this.accbal = accbal;
		}
		public int getAccno() {
			return accno;
		}
		public void setAccno(int accno) {
			this.accno = accno;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getAccbal() {
			return accbal;
		}
		public void setAccbal(int accbal) {
			this.accbal = accbal;
		}
		
		
}
