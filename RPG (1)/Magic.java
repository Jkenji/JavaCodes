abstract class Magic {
  protected String name;
  protected int baseDamage;
  protected String type; 
  
  public Magic(String name, int baseDamage, String type){
    this.name = name;
    this.baseDamage = baseDamage;
    this.type = type;
  }

  public String getName(){
    return this.name;
  }
}