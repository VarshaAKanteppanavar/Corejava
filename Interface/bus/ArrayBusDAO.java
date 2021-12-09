package com.xworkz.inheritance.bus;

public class ArrayBusDAO implements BusDAO {
	BusDTO[] bus = new BusDTO[8];
	int count = 0;

	@Override
	public boolean save(BusDTO busDtos) {
		System.out.println("invoked save");
		if (busDtos != null && count < this.bus.length) {
			bus[count++] = busDtos;
			return true;

		}
		return false;
	}

	@Override
	public void display() {
		System.out.println("invoked display");
		for (int i = 0; i < bus.length; i++) {
			BusDTO ref = bus[i];
			if(ref!=null) {
			System.out.println(ref.getDestination());
			System.out.println(ref.getDiverName());
			System.out.println(ref.getId());
			System.out.println(ref.getStartPoint());

		}else {
			System.out.println("you have given null");
		}
		}
	}
	@Override
	public int update(int index, BusDTO busDtos) {
		System.out.println("invoked update");
		return 0;
	}

	@Override
	public boolean delete(int index) {
		System.out.println("invoked delete");
		return false;
	}
}
