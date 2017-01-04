package ca.zhoozhoo.bj.service;

import org.springframework.data.mongodb.repository.MongoRepository;

import ca.zhoozhoo.bj.domain.Entry;

public interface EntryRepository extends MongoRepository<Entry, String> {

}
