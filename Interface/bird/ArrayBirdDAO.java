package com.xworkz.inheritance.bird;

public class ArrayBirdDAO implements BirdDAO {
	BirdDTO[] birddto = new BirdDTO[8];
	int count = 0;

	@Override
	public boolean save(BirdDTO birdDtos) {
		System.out.println("invoked save");
		if (birdDtos != null && count < this.birddto.length) {
			birddto[count++] = birdDtos;
			return true;
		}
		return false;
	}

	@Override
	public boolean delete(int index) {
		System.out.println("invoked delete");
		if (index < this.birddto.length && index >= 0) {
			this.birddto[index] = null;
			System.out.println("index deleted at".concat(String.valueOf(index)));
			return true;
		}

		return false;
	}

	@Override
	public void display() {
		System.out.println("invoked display");
		for (int i = 0; i < birddto.length; i++) {
			BirdDTO ref= birddto[i];
			if(ref!=null) {
				System.out.println(ref.getAge());
				System.out.println(ref.getBreed());
				System.out.println(ref.getId());
				System.out.println(ref.getOrigin());
				System.out.println(ref.isCanFly());
				
				
			}
			else {
				System.out.println("pointing to null".concat(String.valueOf(i)));
			}
			
		}

	}

	@Override
	public int update(int index, BirdDTO birdDtos)

	{
		System.out.println("invoked update");
		if (index < this.birddto.length && index >= 0 && birdDtos != null) {
			birddto[index] = birdDtos;
			return index;
		}
		return -1;
	}

}
