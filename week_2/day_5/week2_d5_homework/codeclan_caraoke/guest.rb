
class Guest
  attr_reader :guest_name

  def initialize(guest_name_str, guest_wallet_float, guest_fav_song_obj)
    @guest_name = guest_name_str
    @guest_wallet = guest_wallet_float
    @guest_fav_song = guest_fav_song_obj
  end

  def check_wallet
    return @guest_wallet
  end

  def pay(price_float)
    @guest_wallet -= price_float
  end

  def fav_song?(song_obj)
    if @guest_fav_song.artist_name == song_obj.artist_name && @guest_fav_song.song_name == song_obj.song_name
      return true
    end
  end

  def cheer
    return "Yeeeeeeeeeeee!!! Thats my fav!!!"
  end
end
