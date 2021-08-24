Rails.application.routes.draw do
  get 'relationships/create'
  get 'relationships/destroy'
  root to: 'homes#top'
  get '/search', to: 'searchs#search'
  devise_for :users do
  resource :relationships, only: [:create, :destroy]
    get :follows, on: :member # 追加
    get :followers, on: :member # 追加
  # For details on the DSL available within this file, see http://guides.rubyonrails.org/routing.html
  end
  
  
  resources :post_images, only: [:new, :create, :index, :show, :destroy] do
    resources :post_comments, only: [:create, :destroy]
    resource :favorites, only: [:create, :destroy]
  end
  resources :users, only: [:show, :edit, :update]
end
