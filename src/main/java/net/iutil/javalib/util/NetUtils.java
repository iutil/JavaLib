package net.iutil.javalib.util;

import java.net.*;
import java.util.Enumeration;

/**
 * 网络工具类
 *
 * 参考：https://stackoverflow.com/questions/9481865/getting-the-ip-address-of-the-current-machine-using-java
 *
 * @author Erwin Feng
 * @since 2019-07-18 09:38
 */
public class NetUtils {

    /**
     * 获取本地IP地址
     * @return
     * @throws SocketException
     * @throws UnknownHostException
     * @since 暂未发布
     */
    public static String getLocalAddr() throws SocketException, UnknownHostException {
        // 本地ip
        return getLocalHostAddress().getHostAddress();
    }

    private static InetAddress getLocalHostAddress() throws UnknownHostException, SocketException {
        Enumeration allNetInterfaces;
        allNetInterfaces = NetworkInterface.getNetworkInterfaces();
        InetAddress ip;
        while (allNetInterfaces.hasMoreElements()) {
            NetworkInterface netInterface = (NetworkInterface) allNetInterfaces.nextElement();
            Enumeration addresses = netInterface.getInetAddresses();
            while (addresses.hasMoreElements()) {
                ip = (InetAddress) addresses.nextElement();
                if (!ip.isSiteLocalAddress() && !ip.isLoopbackAddress() && !ip.getHostAddress().contains(":")) {
                    if (ip instanceof Inet4Address) {
                        return ip;
                    }
                }
            }
        }
        return InetAddress.getLocalHost();
    }

}
