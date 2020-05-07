# merge method for hash objects.

# hash  = {"a"=>2, "b"=>3}
#
# hash2 = {"c"=>4, "a"=>5}

# old_val block variable will point at values of hash pointed by hash variable
# # new_val block variable points to hash2 variable hash values.
# result = hash.merge(hash2) { |key, old_val, new_val| old_val + new_val }
#
# p result #=> {"a"=>7, "b"=>3, "c"=>4}
# puts
# puts
#
# hsh_4 = {"a" => 4, "b" => 7, "c" => 32, "d" => 3}
# hsh_5 = {"a" => 1, "b" => 7, "c" => 20}
#
# merged_hsh = hsh_4.merge(hsh_5) { |key, hsh_4_val, hsh_5_val|
#   hsh_4_val * hsh_5_val
# }
# p merged_hsh
# puts
# # Pay attention that merge with no block  will replace the values with the existing keys:
# merged_hsh_2_no_block = hsh_4.merge(hsh_5)
# p merged_hsh_2_no_block

# hash = {:item1 => 1}
# hash.merge!({:item2 => 2})
# now hash == {:item1=>1, :item2=>2}


# hash   #=> {"a"=>9, "b"=>200, "c"=>4}
# hash.store("d", 42) #=> 42
# hash   #=> {"a"=>9, "b"=>200, "c"=>4, "d"=>42}


# n Ruby, how to set a default value for a nested hash?
#
# Creating hashes of hashes in Ruby allows for convenient two (or more) dimensional lookups. However, when inserting one must always check if the first index already exists in the hash. For example:

# h = Hash.new
# h['x'] = Hash.new if not h.key?('x')
# h['x']['y'] = 2005
# h['x']['z'] = 4004
# h['a'] = Hash.new if not h.key?('a')
# h['a']['q'] = 31
# p h
#h = {"x"=>
   # {"y"=>2005}}

# It would be preferable to do the following where the new Hash is created automatically:
# h = Hash.new
# h['x']['y'] = value_to_insert

# Similarly, when looking up a value where the first index doesn't already exist, it would be preferable if nil is returned rather than receiving an undefined method for '[]' error.

# looked_up_value = h['w']['z']
#
# You can pass the Hash.new function a block that is executed to yield a default value in case the queried value doesn't exist yet:

# h = Hash.new { |h, k| h[k] = Hash.new }

# so 'a' key does not exist yet but it will be pointed to empty hash default value,
# thats cause the block passed into Hash.new yields a default value of empty hash.
# su h['a'] will have a default value of empty hash
# p h['a']


# deep_nest_hash = Hash.new { |h1, k1| h1[k1] = Hash.new { |h2, k2| h2[k2] = Hash.new
# }}
#
# # "a" is not a key of outer hash yet but will have a default value of empty hash.
# p deep_nest_hash["a"]
#
# # within this empty hash if we select a non-existing key such as "p" it will by default be
# # pointed to another empty hash
# p deep_nest_hash["a"]["p"]
#
# # Autovivification, as it's called, is both a blessing and a curse. The trouble can be that if you "look" at a value before it's defined, you're stuck with this empty hash in the slot and you would need to prune it off later.
# #
# # If you don't mind a bit of anarchy, you can always just jam in or-equals style declarations which will allow you to construct the expected structure as you query it:
#
# ((h ||= { })['w'] ||= { })['z'] ||= {}))
#
# p h["w"]["z"]

#irb(main):002:0> h
# => {"w"=>{}}
# irb(main):003:0> h["w"]
# => {}
# irb(main):004:0> h["w"]["z"]
# => nil

# Ruby Hashes of Arbitrary Depth
# Author: Duane Johnson
# 20 Sep
#
# UPDATE: In the comments, Kent has provided a complete solution to this problem:

hash = Hash.new(&(p=lambda{|h,k| h[k] = Hash.new(&p)}))

# I would love to see this integrated in to the Hash class at some point, but if not, we can (with Ruby’s kind acceptance) do it ourselves:

class Hash
  def self.arbitrary_depth
    Hash.new(&(p=lambda{|h,k| h[k] = Hash.new(&p)}))
  end
end

# Thus,

hash = Hash.arbitrary_depth

p hash['a']['s']['a']["sda"]
