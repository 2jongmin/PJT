package comeit.test.controller;

import java.io.FileOutputStream;

import comeit.framework.security.crypto.ComeitCrypto;

public class ConsoleTest {

  public static void main(String[] args) {
    try {
      StringBuffer sb = new StringBuffer();
      sb.append("-----BEGIN RSA PRIVATE KEY-----");
      sb.append(System.getProperty("line.separator"));
      sb.append("MIIEpAIBAAKCAQEAv2+A7F669v24CA+B67EF/QiIFgL8ffDzZo4afJe6c3lSSix/");
      sb.append(System.getProperty("line.separator"));
      sb.append("To995mdUZhoxfCUoZvXsKbh7yqwo9aijHV7SsRpBWrSRcXWCzyjxoPf2QmeCKGji");
      sb.append(System.getProperty("line.separator"));
      sb.append("9yYc5hI0ioarExAV23jCnGP7NPTcZ6/PXFXKK9qP+c+Xomu+ccn8gRWL19GCSTJJ");
      sb.append(System.getProperty("line.separator"));
      sb.append("CMaG+MfhQgrjEKCp0XRLpfp0Yet/kkLgtDwHzv19ZjSsWsQ+NQoVZUgDMERG/V6V");
      sb.append(System.getProperty("line.separator"));
      sb.append("EG+sn+v6seP7lc0HBtqDgdacCL3xueXMpvNwRfaBzaiRmdeN2IoK5dGId461ew+L");
      sb.append(System.getProperty("line.separator"));
      sb.append("ljx9sj5dRBUPYHMiascNqCoEFxup12QSbUL2SQIDAQABAoIBAGu2hpj42EQfEExg");
      sb.append(System.getProperty("line.separator"));
      sb.append("xV5jVZZBFakk9wK574o1zMtr5/oPOnEHxn3imRlp7IAintNWaPw9xSrYZbbs1YMb");
      sb.append(System.getProperty("line.separator"));
      sb.append("5uOgtfX2au1piiiH0RlU1VgYDRTh/sdT9NjRNhNyDOQgz+NC+rlpoj6ytubeG6Gv");
      sb.append(System.getProperty("line.separator"));
      sb.append("t4Iht0ajjL0nxA8chqSp3QyYnf3JJhMgIHDYE/VX/kK+fsEdCUGygbT9kBS3AcJA");
      sb.append(System.getProperty("line.separator"));
      sb.append("/sD31E206Mc1GQUdhbw30F5mibt/FCfRfl01AsV5c3gqXBvqva17ejipicTpH05/");
      sb.append(System.getProperty("line.separator"));
      sb.append("qP5/xBmuZugBzZIdtoNxLQF5Vo4fBHn8duozyKfb9qPJVjTtKiLJHn4PPjTSBtpw");
      sb.append(System.getProperty("line.separator"));
      sb.append("ymJgHIECgYEA/ZvHr5zBBJjUAJ5btvPiIwktO20OMm4/X65RkVqmAH+rNZKNMecb");
      sb.append(System.getProperty("line.separator"));
      sb.append("swDtWjG/axTzHJdmFTlIrEOu2CQQwDGWN7AtfbgrvC0pWHxbHchqNIuxYZ11Zj+B");
      sb.append(System.getProperty("line.separator"));
      sb.append("z3Y6FKjGN3cFhT6zrj5jr0BalRnJTNE39Rzcny59QSuDnIfPMDS+YHkCgYEAwT2i");
      sb.append(System.getProperty("line.separator"));
      sb.append("x63fjoOb6BAHVH3pQRUv1NV27lfJp3WRSjoK9QGLZig9rpLah6afc7pjyq6A7LPB");
      sb.append(System.getProperty("line.separator"));
      sb.append("Z0fIZdj0/X+PSsKMUKODUmORUtIAMKKmkvlF1uvXjp/s7enWuL7pcNRNX3W54pCB");
      sb.append(System.getProperty("line.separator"));
      sb.append("/GKDMa5/1D8mpy8To8T0cMWgUZ7NgOtAvIP98FECgYEAj/rcEHhnIMv/OGavXRvy");
      sb.append(System.getProperty("line.separator"));
      sb.append("278+/cj5UWpD8ndN+b7EFe5lbiHIpXc2w5aYKieqLAoVx7qwiwYdmydF4ZIALI06");
      sb.append(System.getProperty("line.separator"));
      sb.append("Yl1URlbEBa6CFalsNWlt2m0ghHHXj/goI3dUnBwBhMW+zZn+esMS5xEbHCEqpsD1");
      sb.append(System.getProperty("line.separator"));
      sb.append("CuSa4IiNNe2VZ822tACNwMkCgYEAj8H9vlUAsjIAo0SBX38ILw3G9qwTfT672yOg");
      sb.append(System.getProperty("line.separator"));
      sb.append("gbrqedi7TrVzJdNEVZREnUC1iowFh5I2uFHzqKkdoRTrke9nmXn7cSh3bUijMYtf");
      sb.append(System.getProperty("line.separator"));
      sb.append("JonhRgFP7F/XUCsdPXVxjymxoemf7wgYW50iAqzRliGg7NEd6EDWpKqxGOdt9JGP");
      sb.append(System.getProperty("line.separator"));
      sb.append("KG99U/ECgYBl3X+z1XfhqeiSoe76+72U0iif0HE75MnKfngn0XBk3ZqdUUGal7G6");
      sb.append(System.getProperty("line.separator"));
      sb.append("nitFJs/xKLg/qO27Zroy2wN22OoXHoDRv6NkCxw8wyqPulxaaIklWqwyifbjpDgN");
      sb.append(System.getProperty("line.separator"));
      sb.append("TVzhxhMP0JlxQ23SvnjmP56dcAOqKcJRk+jjf8iU1h2z+DlqDe+JxA==");
      sb.append(System.getProperty("line.separator"));
      sb.append("-----END RSA PRIVATE KEY-----");
      
      FileOutputStream out = new FileOutputStream("c:/temp/pvKey.dat");
      byte[] bytes = sb.toString().getBytes();
      out.write(bytes);
      out.close();
//      ComeitCrypto crypto = new ComeitCrypto();
//
//      String plainText = "asdf";

//      System.out.println("sha256 plain text : " +  plainText);
//      System.out.println("sha256 enc text : " +  crypto.getSHA256Encrypt(plainText));
//      System.out.println("sha256 password compare : " + crypto.comparePassword(plainText, "f0e4c2f76c58916ec258f246851bea091d14d4247a2fc3e18694461b1816e13b"));

//      String decText = crypto.getAES256Encrypt(plainText);
//      System.out.println("aes256 plain text : " + plainText);
//      System.out.println("aes256 enc text : " + decText);
//      System.out.println("aes256 dec text : " + crypto.getAES256Decrypt(decText));
    } catch(Exception ex) {
      ex.printStackTrace();
    }
  }
}
