package net.iutil.javalib.util;

import java.net.*;
import java.util.Enumeration;

/**
 * 网络工具类
 *
 * 参考：https://stackoverflow.com/questions/9481865/getting-the-ip-address-of-the-current-machine-using-java
 *
 * @author Erwin Feng
 * @since 1.0.3
 */
public class NetUtils {

    /**
     * 获取本机网卡IP地址，这个地址为所有网卡中非回路地址的第一个<br>
     * 如果获取失败调用 {@link InetAddress#getLocalHost()}方法获取。<br>
     * 此方法不会抛出异常，获取失败将返回<code>null</code><br>
     *
     * 参考：http://stackoverflow.com/questions/9481865/getting-the-ip-address-of-the-current-machine-using-java
     *
     * @return 本机网卡IP地址，获取失败返回<code>null</code>
     * @since 1.0.3
     */
    public static String getLocalhostStr() {
        InetAddress localhost = getLocalhost();
        if (localhost == null)
            return null;
        return localhost.getHostAddress();
    }

    /**
     * 获取本机网卡IP地址，规则如下：
     *
     * <pre>
     * 1. 查找所有网卡地址，必须非回路（loopback）地址、非局域网地址（siteLocal）、IPv4地址
     * 2. 如果无满足要求的地址，调用 {@link InetAddress#getLocalHost()} 获取地址
     * </pre>1.0.3
     *
     * 此方法不会抛出异常，获取失败将返回<code>null</code><br>
     *
     * 见：https://github.com/looly/hutool/issues/428
     *
     * @return 本机网卡IP地址，获取失败返回<code>null</code>
     * @since 1.0.3
     */
    public static InetAddress getLocalhost() {
        Enumeration allNetInterfaces;
        try {
            allNetInterfaces = NetworkInterface.getNetworkInterfaces();
        } catch (SocketException e) {
            return null;
        }
        InetAddress ip;
        while (allNetInterfaces.hasMoreElements()) {
            NetworkInterface netInterface = (NetworkInterface) allNetInterfaces.nextElement();
            Enumeration addresses = netInterface.getInetAddresses();
            while (addresses.hasMoreElements()) {
                ip = (InetAddress) addresses.nextElement();
                if (!ip.isSiteLocalAddress()
                        && !ip.isLoopbackAddress()
                        && !ip.getHostAddress().contains(":")) {
                    if (ip instanceof Inet4Address) {
                        return ip;
                    }
                }
            }
        }
        try {
            return InetAddress.getLocalHost();
        } catch (UnknownHostException e) {
            return null;
        }
    }


}
