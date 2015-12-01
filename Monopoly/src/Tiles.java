
public abstract class Tiles
	{
		protected int size;
		protected String action;
		protected int position;
		protected String name;
		protected boolean buyable;
		protected boolean isBought = false;
		
		
		public boolean isBuyable() {
			return buyable;
		}
		public void setBuyable(boolean buyable) {
			this.buyable = buyable;
		}
		public void setBought(boolean isBought) {
			this.isBought = isBought;
		}
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
		public boolean getIsBought() {
			// TODO Auto-generated method stub
			return false;
		}
		
		
		
	}
