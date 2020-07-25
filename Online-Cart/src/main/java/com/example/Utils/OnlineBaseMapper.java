package com.example.Utils;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

@Component
public abstract class OnlineBaseMapper<V,D> {
	
	public abstract V convertDTO(D dto);
	public abstract D convertVO(V vo);
	
	public List<V> convertDTOList(List<D> dtos){
		return dtos.stream().map(v->convertDTO(v)).collect(Collectors.toList());
		
	}
	public List<D> convertVOList(List<V> vos){
		return vos.stream().map(a->convertVO(a)).collect(Collectors.toList());
	}
	
	
	public <T> void funPoint (T value, Consumer<T> consumer) {
		if(value != null) {
			consumer.accept(value);
		}
	}

}
