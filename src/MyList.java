public class MyList {
	private Cell firstCell ;
	private int size ;
	
	
	public MyList(int size, Cell prem) {
		this.firstCell=prem;
		this.size=size;
	}
	public MyList() {
		size =  0 ;
	}
	
	public void add(String s) {
		Cell firstnv=new Cell(s);
		Cell firstold= null;
		firstold=firstCell;
		size++;
		if (firstCell!=null)
			firstnv.setNext(firstold);
		
		firstCell=firstnv;
		}
	
	


	
	public void addLast(String s) {
		if(s == null) {
			throw new NullPointerException();
		}
		Cell c ;
		c = firstCell ;
		if(c == null) {
			add(s);
		}
		else {
			while(true) {
				if(c.getNext() == null) {
					c.setNext(new Cell (s));
					this.size ++ ;
					break ;
				}
				c = c.getNext() ;
				
			}
		}

	}
	
	public int size() {
		return size;
	
	}
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		Cell c  = firstCell ;
		
		while(true) {
				sb.append(c.getString() + ", ");
				c = c.getNext();
			
		return sb.toString();
		}
	}
	
	public void add(String s, int index) {
		if(index > size) {
			throw new IllegalArgumentException() ;
		}
		Cell c ;
		c = firstCell ;
		if (index == 0) {
			firstCell = new Cell(s, firstCell) ;
			size ++ ;
		}
		else {
			for(int i = 0 ; i <= index ; i ++) {

				if( i == index - 1) {
					
					c.setNext(new Cell(s,c.getNext()));
					size ++ ;
					break;
				}
				else if(i != index) {
					c = c.getNext() ;
				}
			}
		}
		}
	
	public String get(int i) {
		if(i > size ) {
			throw new IllegalArgumentException() ;
		}
		Cell c ;
		c = firstCell ;
		
		for(int j = 0 ; j <= i ; j ++) {
				if( i == j ) {
					return c.getString();
				}
				c = c.getNext() ;
		}
		return null ;
	}
	
	public int sumLetter() {
		int sum = 0 ;
		Cell c ;
		c = firstCell ;
		while(true) {
			if(c.getNext() != null) {
				sum += c.getString().length();
				c = c.getNext();
				
			}
			else {
				sum += c.getString().length();
				break ;
			}
		}
		return sum ;
		
	}
}