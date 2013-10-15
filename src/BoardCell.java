
public abstract class BoardCell {

	protected int row;
	protected int column;
	
	
	public int getRow() {
		return row;
	}

	public int getColumn() {
		return column;
	}

	protected boolean direction = false;
	protected boolean room = false;
	protected boolean walkway = false;
	
	public BoardCell(int column, int row) {
		this.row = row;
		this.column = column;
	}
	
	public boolean isWalkway(){
		return walkway;
	
	}
	
	public boolean isRoom(){
		return room;
	}
	
	public boolean isDoorway(){
		return direction;
	}
	
	public abstract void draw();

	

}
