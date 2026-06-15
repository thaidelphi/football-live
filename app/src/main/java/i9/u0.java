package i9;

import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;
/* compiled from: ExceptionsConstructor.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
final class u0 extends i {

    /* renamed from: a  reason: collision with root package name */
    public static final u0 f26705a = new u0();

    /* renamed from: b  reason: collision with root package name */
    private static final ReentrantReadWriteLock f26706b = new ReentrantReadWriteLock();

    /* renamed from: c  reason: collision with root package name */
    private static final WeakHashMap<Class<? extends Throwable>, t8.l<Throwable, Throwable>> f26707c = new WeakHashMap<>();

    private u0() {
    }

    @Override // i9.i
    public t8.l<Throwable, Throwable> a(Class<? extends Throwable> cls) {
        t8.l<Throwable, Throwable> b10;
        ReentrantReadWriteLock reentrantReadWriteLock = f26706b;
        ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
        readLock.lock();
        try {
            t8.l<Throwable, Throwable> lVar = f26707c.get(cls);
            if (lVar != null) {
                return lVar;
            }
            ReentrantReadWriteLock.ReadLock readLock2 = reentrantReadWriteLock.readLock();
            int i10 = 0;
            int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
            for (int i11 = 0; i11 < readHoldCount; i11++) {
                readLock2.unlock();
            }
            ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
            writeLock.lock();
            try {
                WeakHashMap<Class<? extends Throwable>, t8.l<Throwable, Throwable>> weakHashMap = f26707c;
                t8.l<Throwable, Throwable> lVar2 = weakHashMap.get(cls);
                if (lVar2 != null) {
                    return lVar2;
                }
                b10 = n.b(cls);
                weakHashMap.put(cls, b10);
                while (i10 < readHoldCount) {
                    readLock2.lock();
                    i10++;
                }
                writeLock.unlock();
                return b10;
            } finally {
                while (i10 < readHoldCount) {
                    readLock2.lock();
                    i10++;
                }
                writeLock.unlock();
            }
        } finally {
            readLock.unlock();
        }
    }
}
