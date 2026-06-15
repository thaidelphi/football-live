package t0;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
/* compiled from: CopyLock.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class a {

    /* renamed from: e  reason: collision with root package name */
    private static final Map<String, Lock> f30912e = new HashMap();

    /* renamed from: a  reason: collision with root package name */
    private final File f30913a;

    /* renamed from: b  reason: collision with root package name */
    private final Lock f30914b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f30915c;

    /* renamed from: d  reason: collision with root package name */
    private FileChannel f30916d;

    public a(String str, File file, boolean z10) {
        File file2 = new File(file, str + ".lck");
        this.f30913a = file2;
        this.f30914b = a(file2.getAbsolutePath());
        this.f30915c = z10;
    }

    private static Lock a(String str) {
        Lock lock;
        Map<String, Lock> map = f30912e;
        synchronized (map) {
            lock = map.get(str);
            if (lock == null) {
                lock = new ReentrantLock();
                map.put(str, lock);
            }
        }
        return lock;
    }

    public void b() {
        this.f30914b.lock();
        if (this.f30915c) {
            try {
                FileChannel channel = new FileOutputStream(this.f30913a).getChannel();
                this.f30916d = channel;
                channel.lock();
            } catch (IOException e8) {
                throw new IllegalStateException("Unable to grab copy lock.", e8);
            }
        }
    }

    public void c() {
        FileChannel fileChannel = this.f30916d;
        if (fileChannel != null) {
            try {
                fileChannel.close();
            } catch (IOException unused) {
            }
        }
        this.f30914b.unlock();
    }
}
