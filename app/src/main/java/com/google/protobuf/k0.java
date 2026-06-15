package com.google.protobuf;

import com.google.protobuf.MapEntryLite;
import java.io.IOException;
import java.util.List;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Reader.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public interface k0 {
    int A() throws IOException;

    void B(List<Long> list) throws IOException;

    void C(List<Integer> list) throws IOException;

    void D(List<Integer> list) throws IOException;

    long E() throws IOException;

    String F() throws IOException;

    int G() throws IOException;

    void H(List<String> list) throws IOException;

    <T> void I(T t10, m0<T> m0Var, ExtensionRegistryLite extensionRegistryLite) throws IOException;

    void J(List<Float> list) throws IOException;

    boolean K() throws IOException;

    int L() throws IOException;

    void M(List<ByteString> list) throws IOException;

    void N(List<Double> list) throws IOException;

    long O() throws IOException;

    String P() throws IOException;

    int a();

    long b() throws IOException;

    void c(List<Integer> list) throws IOException;

    void d(List<Long> list) throws IOException;

    @Deprecated
    <T> void e(List<T> list, m0<T> m0Var, ExtensionRegistryLite extensionRegistryLite) throws IOException;

    boolean f() throws IOException;

    <T> void g(List<T> list, m0<T> m0Var, ExtensionRegistryLite extensionRegistryLite) throws IOException;

    long h() throws IOException;

    void i(List<Long> list) throws IOException;

    int j() throws IOException;

    void k(List<Long> list) throws IOException;

    void l(List<Integer> list) throws IOException;

    int m() throws IOException;

    int n() throws IOException;

    void o(List<Boolean> list) throws IOException;

    @Deprecated
    <T> T p(Class<T> cls, ExtensionRegistryLite extensionRegistryLite) throws IOException;

    <K, V> void q(Map<K, V> map, MapEntryLite.b<K, V> bVar, ExtensionRegistryLite extensionRegistryLite) throws IOException;

    void r(List<String> list) throws IOException;

    double readDouble() throws IOException;

    float readFloat() throws IOException;

    ByteString s() throws IOException;

    int t() throws IOException;

    void u(List<Long> list) throws IOException;

    void v(List<Integer> list) throws IOException;

    long w() throws IOException;

    void x(List<Integer> list) throws IOException;

    <T> T y(Class<T> cls, ExtensionRegistryLite extensionRegistryLite) throws IOException;

    <T> void z(T t10, m0<T> m0Var, ExtensionRegistryLite extensionRegistryLite) throws IOException;
}
