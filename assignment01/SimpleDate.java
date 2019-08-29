package assignment01;


public class SimpleDate{
    private int day;
    private int month;
    private int year;

    public static SimpleDate of(int yr,int m, int d){
        SimpleDate returnval= new SimpleDate();
        returnval.day=d;
        returnval.month=m;
        returnval.year=yr;
        return returnval;
    }
    public boolean before(SimpleDate other){
        boolean returnval=false;
        if (other.year>year){
            returnval= true;
        }
        else if (other.year<year){
            returnval= false;
        }
        else{
            if (other.month>month){
                returnval= true;
            }
            else if (other.month<month){
                returnval= false;
            }
            else{
                if (other.day>day){
                    returnval= true;
                }
                else if (other.day<=day){
                    returnval= false;
                }
            }
        }
        return returnval;
    }
    @Override
    public String toString(){
        return String.format("%d/%d/%d",month,day,year);
    }
}