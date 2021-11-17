package exam03;

class FruitBox<T> {
	T item;
	
	public void store(T item) { // 포장
		this.item = item;
	}
	
	public T pullout() { // 개봉
		return item;
	}
}
