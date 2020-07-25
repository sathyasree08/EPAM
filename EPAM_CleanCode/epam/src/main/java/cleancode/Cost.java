package cleancode;

public class Cost {
double calculateCost(int level,double area,boolean automated)
{
double cost=0;
if(level==1)
{
cost+=(1200*area);
}
else if(level==2)
{
cost+=(1500*area);
}
else if(level==3 && !automated)
{
cost+=(1800*area);
}
else if(level==3 && automated)
{
cost+=(2500*area);
}		
return(cost);	
}
}