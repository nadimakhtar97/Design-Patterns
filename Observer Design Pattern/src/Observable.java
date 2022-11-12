public interface Observable {
    public Boolean add();
    public Boolean remove();
    public void notifyObservers();
    public String getData();
    public void setData();
}
