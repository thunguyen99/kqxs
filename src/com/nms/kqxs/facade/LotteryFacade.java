package com.nms.kqxs.facade;

import java.util.Date;

import com.nms.kqxs.factory.LotteryGetter;
import com.nms.kqxs.factory.kqsx.KqxsConstants;
import com.nms.kqxs.factory.kqsx.Rss_Kqxs_LotteryGetter;
import com.nms.kqxs.factory.kqsx.saxhandler.SAXHandler;
import com.nms.kqxs.factory.kqsx.saxhandler.XSMBSAXHandler;
import com.nms.kqxs.factory.kqsx.saxhandler.XSMNSAXHandler;
import com.nms.kqxs.model.LotteryEntry;

public class LotteryFacade {

	public static LotteryEntry getXS_MB(Date orderDate) {
		LotteryEntry entry = null;

		SAXHandler handler = new XSMBSAXHandler(orderDate);
		LotteryGetter getter = new Rss_Kqxs_LotteryGetter(KqxsConstants.MB, handler);

		try {
			entry = getter.getLottery();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return entry;
	}

	public static LotteryEntry getXS_ANGIANG(Date orderDate) {
		LotteryEntry entry = null;

		SAXHandler handler = new XSMNSAXHandler(orderDate);
		LotteryGetter getter = new Rss_Kqxs_LotteryGetter(KqxsConstants.ANGIANG, handler);

		try {
			entry = getter.getLottery();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return entry;
	}

	public static LotteryEntry getXS_BINHDUONG(Date orderDate) {
		LotteryEntry entry = null;

		SAXHandler handler = new XSMNSAXHandler(orderDate);
		LotteryGetter getter = new Rss_Kqxs_LotteryGetter(KqxsConstants.BINHDUONG, handler);

		try {
			entry = getter.getLottery();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return entry;
	}

	public static LotteryEntry getXS_BINHDINH(Date orderDate) {
		LotteryEntry entry = null;

		SAXHandler handler = new XSMNSAXHandler(orderDate);
		LotteryGetter getter = new Rss_Kqxs_LotteryGetter(KqxsConstants.BINHDINH, handler);

		try {
			entry = getter.getLottery();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return entry;
	}

	public static LotteryEntry getXS_BACNIEU(Date orderDate) {
		LotteryEntry entry = null;

		SAXHandler handler = new XSMNSAXHandler(orderDate);
		LotteryGetter getter = new Rss_Kqxs_LotteryGetter(KqxsConstants.BACLIEU, handler);

		try {
			entry = getter.getLottery();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return entry;
	}

	public static LotteryEntry getXS_BINHPHUOC(Date orderDate) {
		LotteryEntry entry = null;

		SAXHandler handler = new XSMNSAXHandler(orderDate);
		LotteryGetter getter = new Rss_Kqxs_LotteryGetter(KqxsConstants.BINHPHUOC, handler);

		try {
			entry = getter.getLottery();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return entry;
	}

	public static LotteryEntry getXS_BENTRE(Date orderDate) {
		LotteryEntry entry = null;

		SAXHandler handler = new XSMNSAXHandler(orderDate);
		LotteryGetter getter = new Rss_Kqxs_LotteryGetter(KqxsConstants.BENTRE, handler);

		try {
			entry = getter.getLottery();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return entry;
	}

	public static LotteryEntry getXS_BINHTHUAN(Date orderDate) {
		LotteryEntry entry = null;

		SAXHandler handler = new XSMNSAXHandler(orderDate);
		LotteryGetter getter = new Rss_Kqxs_LotteryGetter(KqxsConstants.BINHTHUAN, handler);

		try {
			entry = getter.getLottery();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return entry;
	}

	public static LotteryEntry getXS_CAMAU(Date orderDate) {
		LotteryEntry entry = null;

		SAXHandler handler = new XSMNSAXHandler(orderDate);
		LotteryGetter getter = new Rss_Kqxs_LotteryGetter(KqxsConstants.CAMAU, handler);

		try {
			entry = getter.getLottery();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return entry;
	}

	public static LotteryEntry getXS_CANTHO(Date orderDate) {
		LotteryEntry entry = null;

		SAXHandler handler = new XSMNSAXHandler(orderDate);
		LotteryGetter getter = new Rss_Kqxs_LotteryGetter(KqxsConstants.CANTHO, handler);

		try {
			entry = getter.getLottery();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return entry;
	}

	public static LotteryEntry getXS_DACLAC(Date orderDate) {
		LotteryEntry entry = null;

		SAXHandler handler = new XSMNSAXHandler(orderDate);
		LotteryGetter getter = new Rss_Kqxs_LotteryGetter(KqxsConstants.DALAC, handler);

		try {
			entry = getter.getLottery();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return entry;
	}

	public static LotteryEntry getXS_DONGNAI(Date orderDate) {
		LotteryEntry entry = null;

		SAXHandler handler = new XSMNSAXHandler(orderDate);
		LotteryGetter getter = new Rss_Kqxs_LotteryGetter(KqxsConstants.DONGNAI, handler);

		try {
			entry = getter.getLottery();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return entry;
	}

	public static LotteryEntry getXS_DANANG(Date orderDate) {
		LotteryEntry entry = null;

		SAXHandler handler = new XSMNSAXHandler(orderDate);
		LotteryGetter getter = new Rss_Kqxs_LotteryGetter(KqxsConstants.DANANG, handler);

		try {
			entry = getter.getLottery();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return entry;
	}

	public static LotteryEntry getXS_DACNONG(Date orderDate) {
		LotteryEntry entry = null;

		SAXHandler handler = new XSMNSAXHandler(orderDate);
		LotteryGetter getter = new Rss_Kqxs_LotteryGetter(KqxsConstants.DACNONG, handler);

		try {
			entry = getter.getLottery();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return entry;
	}

	public static LotteryEntry getXS_DONGTHAP(Date orderDate) {
		LotteryEntry entry = null;

		SAXHandler handler = new XSMNSAXHandler(orderDate);
		LotteryGetter getter = new Rss_Kqxs_LotteryGetter(KqxsConstants.DONGTHAP, handler);

		try {
			entry = getter.getLottery();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return entry;
	}

	public static LotteryEntry getXS_GIALAI(Date orderDate) {
		LotteryEntry entry = null;

		SAXHandler handler = new XSMNSAXHandler(orderDate);
		LotteryGetter getter = new Rss_Kqxs_LotteryGetter(KqxsConstants.GIALAI, handler);

		try {
			entry = getter.getLottery();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return entry;
	}

	public static LotteryEntry getXS_TPHCM(Date orderDate) {
		LotteryEntry entry = null;

		SAXHandler handler = new XSMNSAXHandler(orderDate);
		LotteryGetter getter = new Rss_Kqxs_LotteryGetter(KqxsConstants.TP_HCM, handler);

		try {
			entry = getter.getLottery();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return entry;
	}

	public static LotteryEntry getXS_HAUGIANG(Date orderDate) {
		LotteryEntry entry = null;

		SAXHandler handler = new XSMNSAXHandler(orderDate);
		LotteryGetter getter = new Rss_Kqxs_LotteryGetter(KqxsConstants.HAUGIANG, handler);

		try {
			entry = getter.getLottery();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return entry;
	}

	public static LotteryEntry getXS_KIENGIANG(Date orderDate) {
		LotteryEntry entry = null;

		SAXHandler handler = new XSMNSAXHandler(orderDate);
		LotteryGetter getter = new Rss_Kqxs_LotteryGetter(KqxsConstants.KIENGIANG, handler);

		try {
			entry = getter.getLottery();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return entry;
	}

	public static LotteryEntry getXS_KHANHHOA(Date orderDate) {
		LotteryEntry entry = null;

		SAXHandler handler = new XSMNSAXHandler(orderDate);
		LotteryGetter getter = new Rss_Kqxs_LotteryGetter(KqxsConstants.KHANHHOA, handler);

		try {
			entry = getter.getLottery();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return entry;
	}

	public static LotteryEntry getXS_KOMTUM(Date orderDate) {
		LotteryEntry entry = null;

		SAXHandler handler = new XSMNSAXHandler(orderDate);
		LotteryGetter getter = new Rss_Kqxs_LotteryGetter(KqxsConstants.KOMTUM, handler);

		try {
			entry = getter.getLottery();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return entry;
	}

	public static LotteryEntry getXS_LONGAN(Date orderDate) {
		LotteryEntry entry = null;

		SAXHandler handler = new XSMNSAXHandler(orderDate);
		LotteryGetter getter = new Rss_Kqxs_LotteryGetter(KqxsConstants.LONGAN, handler);

		try {
			entry = getter.getLottery();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return entry;
	}

	public static LotteryEntry getXS_LAMDONG(Date orderDate) {
		LotteryEntry entry = null;

		SAXHandler handler = new XSMNSAXHandler(orderDate);
		LotteryGetter getter = new Rss_Kqxs_LotteryGetter(KqxsConstants.LAMDONG, handler);

		try {
			entry = getter.getLottery();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return entry;
	}

	public static LotteryEntry getXS_NINHTHUAN(Date orderDate) {
		LotteryEntry entry = null;

		SAXHandler handler = new XSMNSAXHandler(orderDate);
		LotteryGetter getter = new Rss_Kqxs_LotteryGetter(KqxsConstants.NINHTHUAN, handler);

		try {
			entry = getter.getLottery();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return entry;
	}

	public static LotteryEntry getXS_PHUYEN(Date orderDate) {
		LotteryEntry entry = null;

		SAXHandler handler = new XSMNSAXHandler(orderDate);
		LotteryGetter getter = new Rss_Kqxs_LotteryGetter(KqxsConstants.PHUYEN, handler);

		try {
			entry = getter.getLottery();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return entry;
	}

	public static LotteryEntry getXS_QUANGBINH(Date orderDate) {
		LotteryEntry entry = null;

		SAXHandler handler = new XSMNSAXHandler(orderDate);
		LotteryGetter getter = new Rss_Kqxs_LotteryGetter(KqxsConstants.QUANGBINH, handler);

		try {
			entry = getter.getLottery();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return entry;
	}

	public static LotteryEntry getXS_QUANGNGAI(Date orderDate) {
		LotteryEntry entry = null;

		SAXHandler handler = new XSMNSAXHandler(orderDate);
		LotteryGetter getter = new Rss_Kqxs_LotteryGetter(KqxsConstants.QUANGNGAI, handler);

		try {
			entry = getter.getLottery();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return entry;
	}

	public static LotteryEntry getXS_QUANGNAM(Date orderDate) {
		LotteryEntry entry = null;

		SAXHandler handler = new XSMNSAXHandler(orderDate);
		LotteryGetter getter = new Rss_Kqxs_LotteryGetter(KqxsConstants.QUANGNAM, handler);

		try {
			entry = getter.getLottery();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return entry;
	}

	public static LotteryEntry getXS_QUANGTRI(Date orderDate) {
		LotteryEntry entry = null;

		SAXHandler handler = new XSMNSAXHandler(orderDate);
		LotteryGetter getter = new Rss_Kqxs_LotteryGetter(KqxsConstants.QUANGTRI, handler);

		try {
			entry = getter.getLottery();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return entry;
	}

	public static LotteryEntry getXS_SOCTRANG(Date orderDate) {
		LotteryEntry entry = null;

		SAXHandler handler = new XSMNSAXHandler(orderDate);
		LotteryGetter getter = new Rss_Kqxs_LotteryGetter(KqxsConstants.SOCTRANG, handler);

		try {
			entry = getter.getLottery();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return entry;
	}

	public static LotteryEntry getXS_TIENGIANG(Date orderDate) {
		LotteryEntry entry = null;

		SAXHandler handler = new XSMNSAXHandler(orderDate);
		LotteryGetter getter = new Rss_Kqxs_LotteryGetter(KqxsConstants.TIENGIANG, handler);

		try {
			entry = getter.getLottery();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return entry;
	}

	public static LotteryEntry getXS_TAYNINH(Date orderDate) {
		LotteryEntry entry = null;

		SAXHandler handler = new XSMNSAXHandler(orderDate);
		LotteryGetter getter = new Rss_Kqxs_LotteryGetter(KqxsConstants.TAYNINH, handler);

		try {
			entry = getter.getLottery();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return entry;
	}

	public static LotteryEntry getXS_THUATHIENHUE(Date orderDate) {
		LotteryEntry entry = null;

		SAXHandler handler = new XSMNSAXHandler(orderDate);
		LotteryGetter getter = new Rss_Kqxs_LotteryGetter(KqxsConstants.THUATHIENHUE, handler);

		try {
			entry = getter.getLottery();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return entry;
	}

	public static LotteryEntry getXS_TRAVINH(Date orderDate) {
		LotteryEntry entry = null;

		SAXHandler handler = new XSMNSAXHandler(orderDate);
		LotteryGetter getter = new Rss_Kqxs_LotteryGetter(KqxsConstants.TRAVINH, handler);

		try {
			entry = getter.getLottery();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return entry;
	}

	public static LotteryEntry getXS_VINHLONG(Date orderDate) {
		LotteryEntry entry = null;

		SAXHandler handler = new XSMNSAXHandler(orderDate);
		LotteryGetter getter = new Rss_Kqxs_LotteryGetter(KqxsConstants.VINHLONG, handler);

		try {
			entry = getter.getLottery();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return entry;
	}

	public static LotteryEntry getXS_VUNGTAU(Date orderDate) {
		LotteryEntry entry = null;

		SAXHandler handler = new XSMNSAXHandler(orderDate);
		LotteryGetter getter = new Rss_Kqxs_LotteryGetter(KqxsConstants.VUNGTAU, handler);

		try {
			entry = getter.getLottery();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return entry;
	}
}
