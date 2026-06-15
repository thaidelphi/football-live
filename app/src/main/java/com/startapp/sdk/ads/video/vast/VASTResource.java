package com.startapp.sdk.ads.video.vast;

import com.startapp.u9;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class VASTResource {

    /* renamed from: f  reason: collision with root package name */
    public static final List<String> f22846f = Arrays.asList("image/jpeg", "image/png", "image/bmp", "image/gif");

    /* renamed from: g  reason: collision with root package name */
    public static final List<String> f22847g = Collections.singletonList("application/x-javascript");

    /* renamed from: a  reason: collision with root package name */
    public final String f22848a;

    /* renamed from: b  reason: collision with root package name */
    public final Type f22849b;

    /* renamed from: c  reason: collision with root package name */
    public final CreativeType f22850c;

    /* renamed from: d  reason: collision with root package name */
    public final int f22851d;

    /* renamed from: e  reason: collision with root package name */
    public final int f22852e;

    /* compiled from: Sta */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public enum CreativeType {
        NONE,
        IMAGE,
        JAVASCRIPT
    }

    /* compiled from: Sta */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public enum Type {
        /* JADX INFO: Fake field, exist only in values array */
        STATIC_RESOURCE,
        HTML_RESOURCE,
        IFRAME_RESOURCE
    }

    public VASTResource(String str, Type type, CreativeType creativeType, int i10, int i11) {
        this.f22848a = str;
        this.f22849b = type;
        this.f22850c = creativeType;
        this.f22851d = i10;
        this.f22852e = i11;
    }

    public final String a() {
        StringBuilder sb = new StringBuilder("<!DOCTYPE html><html><head><link rel=\"icon\" href=\"data:;base64,iVBORw0KGgo=\" /><style type=\"text/css\"> html, body { background-color: black; height: 100%; margin: 0; } #content { border: 0px; position: absolute; top: 50%; left: 50%; margin: -");
        sb.append(this.f22852e / 2);
        sb.append("px 0 0 -");
        sb.append(this.f22851d / 2);
        sb.append("px; }</style><script>function performClick() { top.location.href = \"https://www.startapp.com\"; }</script></head><body onclick=\"performClick()\">");
        int ordinal = this.f22849b.ordinal();
        if (ordinal == 0) {
            CreativeType creativeType = this.f22850c;
            if (creativeType == CreativeType.IMAGE) {
                sb.append("<img id=\"content\" width=\"");
                sb.append(this.f22851d);
                sb.append("\" height=\"");
                sb.append(this.f22852e);
                sb.append("\" src=\"");
                sb.append(this.f22848a);
                sb.append("\" />");
            } else if (creativeType == CreativeType.JAVASCRIPT) {
                sb.append("<script src=\"");
                sb.append(this.f22848a);
                sb.append("\" />");
            }
        } else if (ordinal == 1) {
            return this.f22848a;
        } else {
            if (ordinal == 2) {
                sb.append("<iframe id=\"content\" frameborder=\"0\" scrolling=\"no\" marginheight=\"0\" marginwidth=\"0\" width=\"");
                sb.append(this.f22851d);
                sb.append("\" height=\"");
                sb.append(this.f22852e);
                sb.append("\" src=\"");
                sb.append(this.f22848a);
                sb.append("\" />");
            }
        }
        sb.append("</body></html>");
        return sb.toString();
    }

    public static VASTResource a(u9 u9Var, Type type, int i10, int i11) {
        String f10;
        String str;
        String a10;
        u9 a11 = u9Var.a("StaticResource", null);
        String lowerCase = (a11 == null || (a10 = a11.a("creativeType")) == null) ? null : a10.toLowerCase();
        CreativeType creativeType = CreativeType.NONE;
        int ordinal = type.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    f10 = u9Var.f("IFrameResource");
                }
                str = null;
            } else {
                f10 = u9Var.f("HTMLResource");
            }
            str = f10;
        } else {
            f10 = u9Var.f("StaticResource");
            if (f10 != null) {
                List<String> list = f22846f;
                if (!list.contains(lowerCase) && !f22847g.contains(lowerCase)) {
                    f10 = null;
                }
                creativeType = list.contains(lowerCase) ? CreativeType.IMAGE : CreativeType.JAVASCRIPT;
                str = f10;
            }
            str = null;
        }
        CreativeType creativeType2 = creativeType;
        if (str == null) {
            return null;
        }
        return new VASTResource(str, type, creativeType2, i10, i11);
    }
}
