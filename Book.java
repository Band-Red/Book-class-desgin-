public class Book {
    int number;
    String name;
    double prize;
public Book(){
    this.number = number;
    this.name=name;
    this.prize =prize;
}
public Book(int number,String name,double prize){
    this.number =number;
    this.name =name;
    this.prize =prize;
}
public int getNumber(){
    return this.number = number;
}
public String getName(){
    return this.name = name;
}
public double getPrize(){
    return this.prize = prize;
}
public void setNumber(int number) { 
    this.number = number;
}
public void setName(String name) { 
    this.name = name;
}
public void setPrize(double prize) { 
    this.prize = prize;
}
public String toString(){
    return (this.number+"|"+this.name+"|"+this.prize);
}
public void Show(){
    System.out.println("Number"+this.number);
    System.out.println("Name"+this.name);
    System.out.println("Prize"+this.prize);
} 
}    