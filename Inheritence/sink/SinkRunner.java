package com.xworkz;

import java.util.Iterator;

import com.xworkz.sink.FrankeKitchenSink;
import com.xworkz.sink.KaffKitchenSink;
import com.xworkz.sink.Sink;

public class SinkRunner {

	public static void main(String[] args) {
		Sink sink = new Sink();
		System.out.println(sink.color);
		System.out.println(sink.price);
		System.out.println(sink.shape);
		System.out.println(sink.size);
		System.out.println("################################");

		KaffKitchenSink kaff = new KaffKitchenSink();
		System.out.println(kaff.color);
		System.out.println(kaff.material);
		System.out.println(kaff.price);
		System.out.println(kaff.shape);
		System.out.println(kaff.size);
		System.out.println("################################");

		FrankeKitchenSink franke = new FrankeKitchenSink();
		System.out.println(franke.color);
		System.out.println(franke.price);
		System.out.println(franke.shape);
		System.out.println(franke.size);
		System.out.println(franke.usedfor);
		System.out.println("################################");

		Sink sin = new KaffKitchenSink();
		if (sin instanceof KaffKitchenSink) {
			KaffKitchenSink ka = (KaffKitchenSink) sin;
			System.out.println(ka.color);
			System.out.println(ka.material);
			System.out.println(ka.price);
			System.out.println(ka.shape);
			System.out.println("################################");
		}

		Sink sin1 = new FrankeKitchenSink();
		if (sin1 instanceof FrankeKitchenSink) {
			FrankeKitchenSink fr = (FrankeKitchenSink) sin1;
			System.out.println(fr.color);
			System.out.println(fr.price);
			System.out.println(fr.shape);
			System.out.println(fr.size);
			System.out.println(fr.usedfor);
			System.out.println("################################");

		}

		Object obj1 = new Sink();
		if (obj1 instanceof Sink) {
			Sink sink1 = (Sink) obj1;
			System.out.println(sink1.color);
			System.out.println(sink1.price);
			System.out.println(sink1.shape);
			System.out.println(sink1.size);
			System.out.println("################################");
		}

		Object obj2 = new KaffKitchenSink();
		if (obj2 instanceof KaffKitchenSink) {
			KaffKitchenSink sink2 = (KaffKitchenSink) obj2;
			System.out.println(sink2.color);
			System.out.println(sink2.material);
			System.out.println(sink2.price);
			System.out.println(sink2.shape);
			System.out.println(sink2.size);
			System.out.println("################################");

		}

		Object obj3 = new FrankeKitchenSink();
		if (obj3 instanceof FrankeKitchenSink) {
			FrankeKitchenSink sink3 = (FrankeKitchenSink)obj3;
			System.out.println(sink3.color);
			System.out.println(sink3.price);
			System.out.println(sink3.shape);
			System.out.println(sink3.size);
			System.out.println(sink3.usedfor);
			System.out.println("################################");

		}

		Sink[] sinkRef = new Sink[4];
		sinkRef[0] = kaff;
		sinkRef[1] = franke;

		for (int pink = 0; pink < sinkRef.length; pink++) {

			if (sinkRef[pink] instanceof KaffKitchenSink) {
				KaffKitchenSink kaff1 = (KaffKitchenSink) sinkRef[pink];
				{
				System.out.println(kaff1.color);
				System.out.println(kaff1.material);
				System.out.println(kaff1.price);
				System.out.println(kaff1.shape);
				System.out.println(kaff1.size);
				}

			}
			if(sinkRef[pink] instanceof FrankeKitchenSink) {
				FrankeKitchenSink fran=(FrankeKitchenSink)sinkRef[pink];
				{
				System.out.println(fran.color);
				System.out.println(fran.price);
				System.out.println(fran.shape);
				System.out.println(fran.size);
				System.out.println(fran.usedfor);
				}
				
			}

		}
	}

}
