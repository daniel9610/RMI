package RMI;

import java.rmi.Remote;

public interface RemoteInterface extends Remote{
    public double atan(double x, double y) throws Exception;
    public double pow(double x, double y) throws Exception;
    public double min(double x, double y) throws Exception;
    public double max(double x, double y) throws Exception;
}
