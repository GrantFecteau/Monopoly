
public abstract class Tiles
	{
		protected int size;
		protected String action;
		protected int position;
		protected String name;
		
		
		public int getSize() {
			return size;
		}
		public void setSize(int size) {
			this.size = size;
		}
		public String getAction() {
			return action;
		}
		public void setAction(String action) {
			this.action = action;
		}
		public int getPosition() {
			return position;
		}
		public void setPosition(int position) {
			this.position = position;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public abstract String doAction();
		public abstract String doLand();
		
		
		
	}
